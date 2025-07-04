-- 테이블이 존재하면 삭제
DROP TABLE IF EXISTS todos;

-- 테이블 만들기
CREATE TABLE todos(
--    id(할일 ID) : 기본키
ID serial PRIMARY KEY,
--  todo(할일): NOT NULL
todo varchar(255) NOT NULL,
-- detail(설명)
detail text,
-- created_at (작성 일자)
created_at timestamp without time zone,
-- updated_at(업데이트 일자)
updated_at timestamp without time zone
);