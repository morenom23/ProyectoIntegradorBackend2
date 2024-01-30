package co.com.sophos.tienda.persistent.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "compras_productos")
public class CompraProducto {
    @EmbeddedId
    private CompraProductoPK id;

    private Integer cantidad;

    private Double total;

    private Integer estado;


   @ManyToOne
   @JoinColumn(name ="id_compra_prod", insertable = false, updatable = false)
   private Compra compra;

   @ManyToOne
   @JoinColumn(name = "id_producto_prod", insertable = false,updatable = false)
   private Producto producto;
    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
