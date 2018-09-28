package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[100]);
		String f = new String(new char[100]);
		char p;
		int n;
		int m;
		int i;
		int k = -1;
		int sum = 1;
		int s = 0;
		int[] b = new int[100];
		int j;
		int msum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			k++;
		}
		for (i = 0;i <= k;i++)
		{
			if (a.charAt(i) > 96 && a.charAt(i) < 123)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (a.charAt(i) > 47 && a.charAt(i) < 58)
			{
				sum = sum * (a.charAt(i) - 48);
			   for (j = i;j < k;j++)
			   {
				   sum = sum * n;
			   }
			}
			else if (a.charAt(i) > 64 && a.charAt(i) < 91)
			{
				sum = sum * (a.charAt(i) - 55);
				for (j = i;j < k;j++)
				{
					sum = sum * n;
				}
			}
			msum = msum + sum;
			sum = 1;
		}
		for (i = 0;msum >= m;i++)
		{
			b[i] = msum % m;
			if (b[i] >= 0 && b[i] < 10)
			{
				f = tangible.StringFunctions.changeCharacter(f, i, b[i] + 48);
			}
			else if (b[i] >= 10 && b[i] <= 36)
			{
				f = tangible.StringFunctions.changeCharacter(f, i, b[i] + 55);
			}
			msum = msum / m;
			s++;
		}
		if (msum >= 0 && msum < 10)
		{
				p = msum + 48;
		}
		else if (msum >= 10 && msum < 36)
		{
			p = msum + 55;
		}
		System.out.printf("%c",p);
		for (i = s - 1;i >= 0;i--)
		{
			System.out.printf("%c",f.charAt(i));
		}
	}
}

