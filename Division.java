class Division {
    private double x,y;
    private double evaluar;
    
    public double mostrarResultado() {
        return this.x/this.y;
    }
    @Override
    public String toString() {
        return "divicion [x=" + x + ", y=" + y + ", evaluar=" + evaluar + "]";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getEvaluar() {
        return evaluar;
    }

    public void setEvaluar(double evaluar) {
        this.evaluar = evaluar;
    }

   
}