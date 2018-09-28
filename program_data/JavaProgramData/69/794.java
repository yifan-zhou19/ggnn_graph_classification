String num1 = new String(new char[270]);
String num2 = new String(new char[270]);
int i;
int j;
int n1;
int n2;
int[] ans = new int[270];
int[] num = new int[270];
void sup(int,int);
int main()
{
	num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	int n1 = num1.length();
	int n2 = num2.length();
	ans[0] = 0;
	if (n1 > n2)
	{
		for (i = 0;i < n1;i++)
		{ //???
			ans[i + 1] = (int)num1.charAt(i) - 48;
		}
		for (i = 0;i < n2;i++)
		{
			num[i] = (int)num2.charAt(i) - 48; //???
		}
	}
	else
	{
		for (i = 0;i < n2;i++)
		{
			ans[i + 1] = (int)num2.charAt(i) - 48;
		}
		for (i = 0;i < n1;i++)
		{
			num[i] = (int)num1.charAt(i) - 48;
		}
	}
	int n = Math.min(n1,n2);
	int l = Math.max(n1,n2);
	sup(n,l);
	return 0;
}
int it;
void sup(int n,int l)
{
	if (n == 0 && l > 0)
	{
		for (i = Math.max(num1.length(),num2.length());i > 0;i--)
		{
			if (ans[i] >= 10)
			{
				ans[i] %= 10;
				ans[i - 1] += 1;
			}
		}
		for (i = 0; ans[i] == 0 && Math.max(num1.length(),num2.length()); i++)
		{
			;
		}
		if (i == Math.max(num1.length(),num2.length()))
		{
			System.out.print(0);
		}
		else
		{
			for (;i <= Math.max(num1.length(),num2.length());i++)
			{
				System.out.print(ans[i]);
			}
		}
	}
	else if (n == 0)
	{
		for (i = 0; ans[i] == 0 && i < Math.max(num1.length(),num2.length()); i++)
		{
			;
		}
		if (i == Math.max(num1.length(),num2.length()))
		{
			System.out.print(0);
		}
		else
		{
			for (;i <= Math.max(num1.length(),num2.length());i++)
			{
				System.out.print(ans[i]);
			}
		}
		return;
	}
	else
	{
		it = ans[l] + num[n - 1];
		if (it < 10)
		{
			ans[l] = it;
		}
		else
		{
			ans[l] = it % 10;
			ans[l - 1] += 1;
		}
		sup(n - 1,l - 1);
	}
}

