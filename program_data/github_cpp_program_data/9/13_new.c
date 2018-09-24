#include "qsort.h"
#include "factory.h"

#include <chrono>
#include <thread>

static registrar<quicksort> r;

int quicksort::_divide(wrapper& v, int p, int k) {
	int m = (p + k)/2;
	int mv = v[m];

	while (1) {
		while (v[p] < mv) p++;
		while (v[k] > mv) k--;

		if (p < k) {
			std::swap(v[p], v[k]);
			p++;
			k--;
		}
		else {
			return k;
		}
		std::this_thread::sleep_for(std::chrono::microseconds(_delay));
	}

	// never reach here
	return -1;
}

void quicksort::_qs(wrapper& v, int p, int k) {
	if (p < k) {
		int m = _divide(v, p, k);
		_qs(v, p, m);
		_qs(v, m + 1, k);
	}
}

quicksort::quicksort(int d) :
	sorter(d) 
{
}

quicksort::~quicksort() 
{
}

void quicksort::operator()(wrapper& v) {
	_qs(v, 0, v.size() - 1);
}

void quicksort::reg() {
	auto f = factory<sorter>::getInstance();
	f->reg("quicksort",
			[]() -> std::shared_ptr<sorter>  { return std::make_shared<quicksort>(quicksort(50)); } );
}
