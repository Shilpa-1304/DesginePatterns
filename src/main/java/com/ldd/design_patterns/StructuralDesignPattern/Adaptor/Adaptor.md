In our notification system, the application depends on a common NotificationService 
interface. Different SMS vendors like Sinch and Karix expose different APIs (sendSms(),
triggerMessage(), etc.). Using the Adapter Pattern, I create vendor-specific adapters that 
implement NotificationService and internally translate calls to the respective vendor APIs. 
This allows us to switch SMS providers without changing business code, which follows the Open/Closed
Principle and reduces vendor lock-in.