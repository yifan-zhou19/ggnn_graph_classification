/**
* ??
* 2010?12?4
* ????
*/
int g_n; //g_n??????
int jishu = int; //????
int oushu = int; //????
int main()
{
	g_n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (g_n == 1)
	{
		System.out.print("End");
		System.out.print("\n");
	}
	else
	{
		for (;g_n != 1;)
		{
			if (g_n % 2 == 0) //?n?= 1?????????????????????
			{
				g_n = oushu(g_n);
			}
			else
			{
				g_n = jishu(g_n);
			}
		}
		System.out.print("End");
		System.out.print("\n");
	}
	return 0;
}
int jishu(int n) //????????????
{
	System.out.print(n);
	System.out.print("*3+1=");
	System.out.print(n * 3 + 1);
	System.out.print("\n");
	return n * 3 + 1;
}

int oushu(int n) //????????????
{
	System.out.print(n);
	System.out.print("/2=");
	System.out.print(n / 2);
	System.out.print("\n");
	return n / 2;
}




