/*??????
 *?????function2-1.cpp
 *Created on: 2012-11-25
 *???????
 */
void f(int);
int a; //????
int b;
int i;
int j;

int main()
{
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	f(a);
	return 0; //????
}

void f(int x)
{
	if (x == 1) //x=1???
	{
			System.out.print("End");
			System.out.print("\n");
			return;
	}
	if (x % 2 == 1)
	{
		System.out.print(x);
		System.out.print("*3+1=");
		System.out.print(3 * x + 1);
		System.out.print("\n");
		return f(3 * x + 1);
	} //x??????
	if (x % 2 == 0)
	{
		System.out.print(x);
		System.out.print("/2=");
		System.out.print(x / 2);
		System.out.print("\n");
		return f(x / 2);
	} //x??????
}


