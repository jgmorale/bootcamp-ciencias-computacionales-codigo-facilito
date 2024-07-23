import java.util.ArrayList;

public class Cpu {
    private int[] registers;
    private int[] memory;
    // El instruction pointer a veces se llama Program Counter PC
    // Rs es el stack pointer
    private int IP = 0;
    private int SP = 0;

    public static void main(String[] args){
        Cpu cpu = new Cpu();
        ArrayList<String[]> instructions = new ArrayList<String[]>();
        cpu.run(instructions);
    }

    public void run(ArrayList<String[]> program){
        // Leer las instrucciones hasta el final e imprimir el resultado
    }

    public void add(int arg1, int arg2, int result){ // Ra, Rb, Rc
        this.registers[result] = this.registers[arg1] + this.registers[arg2] ;
    }

    public void jmp(int arg1, int offset){
        this.registers[1] = this.registers[arg1] + offset;
    }

    public int[] getRegisters(){
        return this.registers;
    }

    public void setRegisters(int[] registers){
        this.registers = registers;
    }

    public int[] getMemory(){
        return this.memory;
    }
    
    public void setMemory(int[] memory){
        this.memory = memory;
    }

    // ('ADD', 'Ra', 'Rb', 'Rc')
    // ('SUB', 'Ra', 'Rb', 'Rc')
    // ('MUL', 'Ra', 'Rb', 'Rc')
    // ('DIV', 'Ra', 'Rb', 'Rc')
    // ('INC', 'Ra')
    // ('DEC', 'Ra')
    // ('CMP', 'op', 'Ra', 'Rb', 'Rc') # op = {<, >, <=, >=, ==, !=}
    // ('CONST', value, 'Ra')
    // ('LOAD', 'Rs', 'Rd', offset)    # Simulando nuestra RAM
    // ('STORE', 'Rs', 'Rd', offset)   # Simulando nuestra RAM
    // ('JMP', 'Rd', offset)           # Mueve el IP a la direccion de memoria
    // ('HALT')
}
