import unittest

from src.main.python.me.dongqinglin.DynamicArray import DynamicArray


class MyTestCase(unittest.TestCase):
    def test_should_be_created(self):
        array = DynamicArray()
        for i in range(100):
            array.put(98)
            array.put(99)
            array.put(100)
        self.assertEqual(300, len(array))


if __name__ == '__main__':
    unittest.main()
