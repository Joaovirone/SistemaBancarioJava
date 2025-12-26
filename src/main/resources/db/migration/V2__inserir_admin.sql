-- Insere um usuário admin já pronto
-- Login: admin
-- Senha: admin123 (Criptografada com BCrypt)
-- Role: admin

INSERT INTO usuarios (login, senha, role) 
VALUES ('admin', '$2a$10$hK.7.7.7.7.7.7.7.7.7.7.7.7.7.7.7.7.7.7.7.7.7.7.7.7', 'admin')
ON CONFLICT (login) DO NOTHING;