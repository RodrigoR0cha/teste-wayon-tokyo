<template>
  <div class="submit-form">
      <h4>{{agenda.response}}</h4>    
    
      <div class="form-group">        
        <label for="contaPrincipio">Conta Principio</label>
        <input
          type="text"
          class="form-control"
          id="contaPrincipio"
          required
          v-model="agenda.contaPrincipio"
          name="contaPrincipio"
        />
      </div>
      <div class="form-group">
        <label for="contaDestino">Conta Destino</label>
        <input
          class="form-control"
          id="contaDestino"
          required
          v-model="agenda.contaDestino"
          name="contaDestino"
        />
      </div>
      <div class="form-group">
        <label for="valorTransferido">Valor Transferido</label>
        <input
          class="form-control"
          id="valorTransferido"
          required
          v-model="agenda.valorTransferido"
          name="valorTransferido"
        />
      </div>      
      <div class="form-group">
        <label for="dataTransferencia">Data Transferencia - YYYY-MM-DD</label>
        <input
          class="form-control"
          id="dataTransferencia"
          required
          v-model="agenda.dataTransferencia"
          name="dataTransferencia"
        />
      </div>
      <button @click.prevent="saveAgendamento" class="btn btn-success">Agendar</button>            
      <p class="alert alert-success" v-show="response" v-text="response"></p>
      <p class="alert alert-danger" v-show="status" v-text="status"></p>

    </div>    
 
</template>
<script>
import AgendamentoDataService from "../services/AgendamentoDataService";

export default {
  name: "add-agendamento",
  data() {
    return {
      agenda: {       
        contaPrincipio: "",
        contaDestino: "",
        valorTransferido:"",
        dataTrasnferencia: ""        
      },     
      submitted: false,
      status: false,
      response: false
    };
  },
  
  methods: {
    saveAgendamento() {
      this.response = ""
      this.status = ""
      var data = {
        contaPrincipio: this.agenda.contaPrincipio,
        contaDestino: this.agenda.contaDestino,
        valorTransferido: this.agenda.valorTransferido,
        dataTransferencia: this.agenda.dataTransferencia
      };
      AgendamentoDataService.create(data)
        .then(response => {
          this.response = response.data;          
          console.log(response.data);
          this.submitted = true;
        })
        .catch(error => {
          this.status = error.response.data;
          console.log(error);
        });
    },
        
  }
};
</script>
<style>
.submit-form {
  max-width: 300px;
  margin: auto;
}
</style>