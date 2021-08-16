public with sharing class InvokeFunction {
    public InvokeFunction() {
        System.debug('Invoke my funct');
        functions.Function infoStatementFunction = functions.Function.get('InfoStatementOutboundSFPOC.issueinfostatement');
        functions.FunctionInvocation invocation = infoStatementFunction.invoke('{"requestNumber":"ISN-0000","pdfTarget":"SAIGPROPERTY","pdfBucket":"echo-pdf","pdfKey":"0011r000025qGbjAAE/a1L1r000007bzXAEAY/bill_a0U1v00000DY2WlEAL.pdf","solicitorReference":"Test_Ref"}');
        String jsonResponse = invocation.getResponse();
        System.debug('Got response ' + jsonResponse);
    }
}
