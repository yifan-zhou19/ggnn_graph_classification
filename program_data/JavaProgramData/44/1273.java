int reverse = int;
int main()
{

	int i;
	int[] in = new int[6];
	for (i = 0;i < 6;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			in[i] = Integer.parseInt(tempVar);
		}
		if (i < 5)
		{
			System.in.read();
		}
		in[i] = reverse(in[i]);
	}
	for (i = 0;i < 6;i++)
	{
		System.out.printf("%d",in[i]);
		if (i < 5)
		{
			System.out.print("\n");
		}
	}
	return 0;
}

int reverse(int n)
{
	int dig;
	int i;
	int ans = 0;
	int del;
	dig = (int)Math.log10(Math.abs(n));
	for (i = 0;i <= dig;i++)
	{
		del = Math.pow(10,(dig - i));
		ans += (int)Math.pow(10,i) * (int)(n / del);
		n = n - ((int)(n / del) * del);
	}
	if (n < 0)
	{
		ans = -ans;
	}
	return (ans);
}

