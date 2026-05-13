namespace java ec.edu.uteq.distribuidas.rpc.gen

exception OperacionInvalidaException {
    1: required string mensaje
}

service Calculadora {
    double sumar      (1: double a, 2: double b)
    double restar     (1: double a, 2: double b)
    double multiplicar(1: double a, 2: double b)
    double dividir    (1: double a, 2: double b)
        throws (1: OperacionInvalidaException ex)
    string nombreServidor()
}