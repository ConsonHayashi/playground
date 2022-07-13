
class DynamicArray:
    datas = list()
    index = 0

    def __int__(self):
        pass

    def put(self, data):
        self.datas.append(data)
        self.index = self.index + 1

    def __len__(self):
        return len(self.datas)

