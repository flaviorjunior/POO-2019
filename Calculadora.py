class Calc:
    def __init__(self, batMax):
        self.battery = 0
        self.batteryMax = batMax


    def charge (self, value):
        self.battery += value
        if (self.battery > self.batteryMax):
            self.battery = self.batteryMax


    def soma (self, v1, v2):
        if self.battery > 0:
            print (int(v1) + (int(v2)))
            self.battery -= 1
        else:
            print ("fail: bateria insuficiente")


    def divisao (self, v1, v2):
        if self.battery > 0:
            print (int(v1) / (int(v2)))
            self.battery -= 1
        else:
            print ("fail: bateria insuficiente")

       

    

    def __str__ (self):
        return "battery = " + str(self.battery) + "/" + str(self.batteryMax)


print ("show, init _maxCarga, charge _value, sum _a _b, div _a _b")
while True:
    ui = input().split(' ')
    if ui[0] == "end":
        break
    elif ui[0] == "init":
        calc = Calc(int(ui[1]))
    elif ui[0] == "show":
        print (calc)
    elif ui[0] == "charge":
        calc.charge(int(ui[1]))
    elif ui[0] == "sum":
        calc.soma(ui[1], ui[2])
    elif ui[0] == "div":
        calc.divisao(ui[1], ui[2])
    else:
        print("comando inválido")
        
