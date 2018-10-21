// ????2.cpp : ??????????????
//


void out(int,int);

int t = 1;


int main()
{
	int n = 0;
	int i = 0;
	double sum = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 1;i <= n;i++)
	{
		sum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		out(sum,2.0);
		System.out.print(t);
		System.out.print("\n");
		t = 1;
	}

	i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	return 0;
}

void out(int sum,int q)
{
		int num = 0;
		double m = sum;
		num = Math.sqrt(m);
		if (sum % q == 0 && q <= num)
		{
			t++;
			out(sum / q,q);
			out(sum,q + 1);
		}
		if (sum % q != 0 && q <= num)
		{
			out(sum,q + 1);
		}
}






