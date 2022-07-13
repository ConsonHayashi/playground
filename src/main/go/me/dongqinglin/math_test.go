package dongqinglin

import "testing"

func TestAdd(t *testing.T) {
	got := Add(2, 3)
	expect := int8(5)
	if got != expect {
		t.Errorf("fail")
	}
}