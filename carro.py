class Carro:
    def __init__(self):
        self.gas = 0
        self.passag = 0
        self.km  = 0



    def embarq (self):
        if self.passag < 2:
            self.passag += 1
        else:
            print ("fail: limite de pessoas atingido")
            
    def desemb (self):
        if self.passag > 0:
            self.passag -= 1
        else:
            print ("fail: nao ha ninguem no carro")
            
    def abast (self, lit):
        if lit > 0 and lit < 10:
            self.gas = int(lit)
        else:
            self.gas = 10
            
    def andar (self, valorKm):
        if self.passag > 0:
            lit_p = valorKm / 10
        
            if lit_p <= self.gas:
                self.gas -=lit_p
                self.km += valorKm
            else:
                print ("fail: gasolina insuficiente")
        else:
            print ("fail: nao ha ninguem no carro")
            
    def __str__ (self):
        return "pass: " + str(self.passag) + ", gas: " + str(self.gas) + ", km: " + str(self.km)

carr = Carro()
print ("show, emb, des, end, drive _X, fuel _Y")

while True:
    ui = input().split(' ')
    if ui[0] == "end":
        break
    elif ui[0] == "show":
        print (carr)
    elif ui[0] == "emb":
        carr.embarq()
        print (carr.passag)
    elif ui[0] == "des":
        carr.desemb()
        print (carr.passag)
    elif ui[0] == "drive":
        carr.andar(int(ui[1]))
    elif ui[0] == "fuel":
        carr.abast(int(ui[1]))
    else:
        print ("comando invalido")





#lit.p - () - :
