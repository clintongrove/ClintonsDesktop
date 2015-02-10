#include "stdafx.h"
#include <iostream>
using namespace std;

class Animal
{
public:
	Animal(){};
};

class Cat : public Animal
{
public:
	bool mouth;
	Cat()
	{
		mouth = 1;
	}
};


int _tmain(int argc, _TCHAR* argv[])
{
	Cat c = Cat();
	return 0;
}