<?php

// Almacenamiento en el buffer
ob_start();

session_start();

if (!isset($_SESSION['nombre'])) {
  header("Location: login.html");
}else{
require 'header.php';

if($_SESSION['compras']==1)
{
?>

<!--Contenido-->
      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        
        <!-- Main content -->
        <section class="content">
            <div class="row">
              <div class="col-md-12">
                  <div class="box">
                    <div class="box-header with-border">
                          <h1 class="box-title">PROVEEDOR<button class="btn btn-success" onclick="mostrarForm(true)"><i class="fa fa-plus-circle"></i> Agregar</button></h1>
                        <div class="box-tools pull-right">
                        </div>
                    </div>
                    <!-- /.box-header -->
                    <!-- centro -->
                    <div class="panel-body table-responsive" id="listadoregistros">

                        <table id="tbllistado" class="table table-striped table-bordered table-hover">
                          <thead>
                            <th>Opciones</th>
                            
                            <th>Nombre</th>
                            <th>Documento</th>
                            <th>Numero</th>
                            <th>Telefono</th>
                            <th>Correo</th>
                          </thead>
                          
                          <tbody>
                              
                          </tbody>

                          <tfoot>
                            <th>Opciones</th>
                            
                            <th>Nombre</th>
                            <th>Documento</th>
                            <th>Numero</th>
                            <th>Telefono</th>
                            <th>Correo</th>
                          </tfoot>

                        </table>
                    </div>
                    <div class="panel-body" id="formularioregistros">
                          
                        <form action="POST" name="formulario" id="formulario">
                          <div class="form-group col-sm-6 col-xs-12">
                            <label for="nombre">Nombre:</label>
                            <input type="hidden" name="idpersona" id="idpersona" >
                            <input type="hidden" name="tipo_persona" id="tipo_persona" value="Proveedor">
                            <input type="text" class="form-control" name="nombre" id="nombre" maxlength="100" placeholder="Nombre" required>
                          </div>
                          <div class="form-group col-sm-6 col-xs-12">
                            <label for="">Tipo Documento</label>
                            <select name="tipo_documento" id="tipo_documento" required class="form-control select-picker">
                              <option value="DNI">DNI</option>
                              <option value="CI">CI</option>
                            </select>
                          </div>
                          <div class="form-group col-sm-6 col-xs-12">
                            <label for="">Numero de Documento</label>
                            <input type="text" class="form-control" name="num_documento" id="num_documento" placeholder="numero" max="20">
                          </div>
                          <div class="form-group col-sm-6 col-xs-12">
                            <label for="">Direccion</label>
                            <input type="text" class="form-control" name="direccion" id="direccion  " placeholder="Direccion" max="20">
                          </div>
                          <div class="form-group col-sm-6 col-xs-12">
                            <label for="">Telefono</label>
                            <input type="text" class="form-control" name="telefono" id="telefono" placeholder="Telefono" max="20">
                          </div>
                          <div class="form-group col-sm-6 col-xs-12">
                            <label for="">Correo</label>
                            <input type="email" class="form-control" name="correo" id="correo" placeholder="ejemplo@gmail.com" max="20">
                          </div>
                          <div class="form-group col-12">
                            <button class="btn btn-primary" type="submit" id="btn-guardar" onclick="insertarForm(event);">Guardar</button>
                            
                            <button class="btn btn-warning" type="submit" id="btn-editar" onclick="editarForm(event);">Editar</button>
                            
                            
                            <button class="btn btn-danger" type="submit" id="btn-cerrar" onclick="cancelarForm();">Cerrar </button>
                            
                          </div>
                        </form>        

                    </div>
                    <!--Fin centro -->
                  </div><!-- /.box -->
              </div><!-- /.col -->
          </div><!-- /.row -->
      </section><!-- /.content -->

    </div><!-- /.content-wrapper -->
  <!--Fin-Contenido-->

  <?php
  require 'footer.php';
  }
  else {
    require 'noacceso.php';
  }
  ?> 

  <script src="scripts/proveedor.js"> 
  </script>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/5.4.0/bootbox.min.js"></script>
  <?php
  }
  ob_end_flush();
?>