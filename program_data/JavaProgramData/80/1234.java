package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int sy;
	int sm;
	int sd;
	int ey;
	int em;
	int ed;
	int a;
	int b;
	int i;
	int j;
	int k;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		sy = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		sm = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		sd = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		ey = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		em = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		ed = Integer.parseInt(tempVar6);
	}
	a = 1;
	i = 0;

	while (a < sy)
	{
	if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
	{
		i++;
		a++;
	}
	else
	{
	a++;
	}
	}
	{
	if (((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0)) && (sm > 2))
	{
	i++;
	}
}


	b = 1;
	j = 0;
	while (b < sm)
	{
	if ((b == 1) || (b == 3) || (b == 5) || (b == 7) || (b == 8) || (b == 10) || (b == 12))
	{
		j++;
	b++;
	}
	else
	{
	if (b == 2)
	{
		j = j - 2;
		b++;
	}
	else
	{
	b++;
	}
	}

	}
	k = sy * 365 + sm * 30 + sd + j + i;


	int A;
	int B;
	int I;
	int J;
	int K;
	I = 0;
	A = 1;

	while (A < ey)
	{
	if ((A % 4 == 0 && A % 100 != 0) || (A % 400 == 0))
	{
	I++;
	A++;
	}
	else
	{
	A++;
	}
	}

	if (((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0)) && (em > 2))
	{
	I++;
	}


	B = 1;
	J = 0;
	while (B < em)
	{
	if ((B == 1) || (B == 3) || (B == 5) || (B == 7) || (B == 8) || (B == 10) || (B == 12))
	{
		J++;
	B++;
	}
	else
	{
	if (B == 2)
	{
		J = J - 2;
		B++;
	}
	else
	{
	B++;
	}
	}
	}
	K = ey * 365 + em * 30 + ed + J + I;
	x = K - k;

	System.out.printf("%d\n",x);
	}


}

