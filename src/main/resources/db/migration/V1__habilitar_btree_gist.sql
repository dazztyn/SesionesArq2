-- Extensión necesaria para la restricción EXCLUDE USING gist que impedirá
-- choques de horario de un tutor (combina igualdad sobre tutor_id con
-- solapamiento de rangos sobre horario).
CREATE EXTENSION IF NOT EXISTS btree_gist;
