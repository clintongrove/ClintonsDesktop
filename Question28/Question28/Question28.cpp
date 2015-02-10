#include "stdafx.h"
#define _USE_MATH_DEFINES
#include <iostream>
#include <math.h>
using namespace std;



class Circle{
public:
	Circle(){ radius = 0; };
	Circle(int x){ radius = x; };
	double getArea(){
		double area = M_PI*radius*radius;
		return area;
	};
	double get(){ return radius; };
	void set(int x){ radius = x; };
	Circle Circle:: operator +(Circle c){
		Circle temp(0);
		temp.radius = radius + c.radius;
		return temp;
	}
private:
	double radius;
};

int _tmain(int argc, _TCHAR* argv[])
{
	Circle c = Circle(5);
	Circle d = Circle(6);
	cout << (c + d).get() << endl;
	return 0;
}