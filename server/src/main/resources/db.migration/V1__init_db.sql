CREATE TABLE IF NOT EXISTS users
(
    id        BIGSERIAL PRIMARY KEY,
    role      VARCHAR(64)         NOT NULL,
    email     VARCHAR(128) UNIQUE NOT NULL,
    password  VARCHAR(128)        NOT NULL,
    cellphone VARCHAR(128) UNIQUE,
    name      VARCHAR(64)         NOT NULL,
    surname   VARCHAR(64)         NOT NULL,
    city      VARCHAR(256)
);

CREATE TABLE IF NOT EXISTS user_structure_tag_holders
(
    id                 BIGSERIAL PRIMARY KEY,
    user_id            BIGINT REFERENCES users (id),
    room_tag_count     BIGINT DEFAULT 0,
    flat_tag_count     BIGINT DEFAULT 0,
    house_tag_count    BIGINT DEFAULT 0,
    rent_tag_count     BIGINT DEFAULT 0,
    purchase_tag_count BIGINT DEFAULT 0
);

CREATE TABLE IF NOT EXISTS structures
(
    id           BIGSERIAL PRIMARY KEY,
    publisher_id BIGINT REFERENCES users (id),
    price        MONEY         NOT NULL,
    title        VARCHAR(128)  NOT NULL,
    description  VARCHAR(2048) NOT NULL,
    city         VARCHAR(256)  NOT NULL,
    address      VARCHAR(512)  NOT NULL,
    square       REAL          NOT NULL,
    floor        SMALLINT,
    room_count   SMALLINT
);

CREATE TABLE IF NOT EXISTS structure_images
(
    id           BIGSERIAL PRIMARY KEY,
    structure_id BIGINT REFERENCES structures (id),
    image_path   VARCHAR(256) NOT NULL
);

CREATE TABLE IF NOT EXISTS structure_tags
(
    id           BIGSERIAL PRIMARY KEY,
    structure_id BIGINT REFERENCES structures (id),
    tag          VARCHAR(128) NOT NULL
);

CREATE TABLE IF NOT EXISTS followers_to_structures
(
    id           BIGSERIAL PRIMARY KEY,
    follower_id  BIGINT REFERENCES users (id),
    structure_id BIGINT REFERENCES users (id),
    UNIQUE (follower_id, structure_id)
);

CREATE TABLE IF NOT EXISTS chats
(
    id BIGSERIAL PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS users_to_chats
(
    id      BIGSERIAL PRIMARY KEY,
    user_id BIGINT REFERENCES users (id),
    chat_id BIGINT REFERENCES chats (id),
    UNIQUE (user_id, chat_id)
);

CREATE TABLE IF NOT EXISTS chat_messages
(
    id      BIGSERIAL PRIMARY KEY,
    chat_id BIGINT REFERENCES chats (id),
    user_id BIGINT REFERENCES users (id),
    message VARCHAR(512) NOT NULL,
    sent_at TIMESTAMP    NOT NULL
);

CREATE TABLE IF NOT EXISTS mailing_entities
(
    id    BIGSERIAL PRIMARY KEY,
    email VARCHAR(128) REFERENCES users (email)
);

CREATE TABLE IF NOT EXISTS admin_messages
(
    id           BIGSERIAL PRIMARY KEY,
    publisher_id BIGINT REFERENCES users (id),
    message      VARCHAR(512) NOT NULL,
    sent_at      TIMESTAMP    NOT NULL
);