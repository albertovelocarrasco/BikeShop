This solution follows the next basic integration
![intro](intro.png)

Channels(App, Web) will access the backend throught the gateway services. Having the Gateway Services layer allows the pure backend and frontend sides to be decoupled.
This way we can safely modificate the backend model without impacting the frontend, and viceversa

---
This is how the frontend would interact with the gateway services to show the customer the booking flow steps. There's a missing interaction with OrderService to "pay" on the checkout screen.
![bookingflow](bookingFlow.png)
