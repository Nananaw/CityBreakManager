<h1>City Break Manager - Spring Boot REST API</h1>
<p>City Break Manager is a Spring Boot RESTful application designed for travel enthusiasts who want to track their city trips and dream destinations. 
  The application allows users to manage cities they have visited or plan to visit, as well as log individual trips with ratings and personal notes. 
  This project demonstrates a layered backend architecture using Spring Boot, dependency injection, and an in-memory data store.</p>
<a href="https://explainjavalikeim8.com/spring-projects-ideas/">Project Inspiration</a>

<h2>Architecture</h2>
<ul>
  <li>Controller - handles HTTP requests</li>
  <li>Service - contains business logic</li>
  <li>Repository - manages data storage</li>
  <li>Domain - defines core entities</li>
</ul>


<h2>REST API Endpoints </h2>

<h3>Cities</h3>
<table>
  <thead>
    <tr>
      <th>HTTP Method</th>
      <th>Endpoint</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>GET</td>
      <td>/cities</td>
      <td>Retrieve all cities</td>
    </tr>
    <tr>
      <td>GET</td>
      <td>/cities/{id}</td>
      <td>Retrieve a city by its ID</td>
    </tr>
    <tr>
      <td>POST</td>
      <td>/cities</td>
      <td>Create a new city</td>
    </tr>
    <tr>
      <td>PUT</td>
      <td>/cities/{id}</td>
      <td>Update an existing city</td>
    </tr>
    <tr>
      <td>DELETE</td>
      <td>/cities/{id}</td>
      <td>Delete a city by its ID</td>
    </tr>
  </tbody>
</table>

<h3>Trips</h3>
<table>
  <thead>
    <tr>
      <th>HTTP Method</th>
      <th>Endpoint</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>GET</td>
      <td>/trips</td>
      <td>Retrieve all trips</td>
    </tr>
    <tr>
      <td>GET</td>
      <td>/trips/{id}</td>
      <td>Retrieve a trip by its ID</td>
    </tr>
    <tr>
      <td>POST</td>
      <td>/trips</td>
      <td>Create a new trip</td>
    </tr>
    <tr>
      <td>PUT</td>
      <td>/trips/{id}</td>
      <td>Update an existing trip</td>
    </tr>
    <tr>
      <td>DELETE</td>
      <td>/trips/{id}</td>
      <td>Delete a trip by its ID</td>
    </tr>
  </tbody>
</table>


