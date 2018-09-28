package <missing>;

public class GlobalMembers
{
	//By Ethen Yi No.1200011797 Class 5 CCME
	public static int Main()
	{
		final String a = "";
		final String b = "";
		fgets(a,205,stdin);
		fgets(b,205,stdin);
		int i;
		for (i = 0;i < NUM;i++)
		{
			if (a.charAt(i) == '\n')
			{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			}
			if (b.charAt(i) == '\n')
			{
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			}
		}
		int na; //the real lenth of a, b and result
		int nb;
		int nresult = 0;
		int t;
		for (i = NUM - 1;i >= 0;i--)
		{
			if (a.charAt(i) != '\0')
			{
				na = i;
				break;
			}
		}
		for (i = NUM - 1;i >= 0;i--)
		{
			if (b.charAt(i) != '\0')
			{
				nb = i;
				break;
			}
		}
		int[] a1 = new int[NUM]; //change char into int
		int[] b1 = new int[NUM];
		if (na >= nb)
		{
			for (i = 0;i <= na;i++)
			{
				a1[i] = a.charAt(i) - '0';
			}
			for (i = 0;i <= nb;i++)
			{
				b1[i] = b.charAt(i) - '0';
			}
		}
		else
		{
			t = nb;
			nb = na;
			na = t;
			for (i = 0;i <= na;i++)
			{
				a1[i] = b.charAt(i) - '0';
			}
			for (i = 0;i <= nb;i++)
			{
				b1[i] = a.charAt(i) - '0';
			}
		}
		if (nb != na)
		{
			for (i = na;i >= na - nb;i--)
			{
				b1[i] = b1[i - na + nb];
			}
			for (i = 0;i < na - nb;i++)
			{
				b1[i] = 0;
			}
		}
		/*for(i=0;i<=na;i++)
		    printf("%d",a1[i]);
		printf("\n");
		for(i=0;i<=na;i++)
		    printf("%d",b1[i]);
		printf("\n");*/
		int[] result = new int[NUM + 1];
		for (i = 0;i <= na;i++)
		{
			result[NUM - i] += (a1[na - i] + b1[na - i]);
			t = result[NUM - i] % 10;
			result[NUM - 1 - i] += (result[NUM - i] - t) / 10;
			result[NUM - i] = t;
		}
		while (result[nresult] == 0 && nresult <= NUM)
		{
			nresult++;
		}
		//printf("%d",nresult);
		if (nresult == NUM + 1)
		{
		System.out.print("0");
		}
		else
		{
		for (i = nresult;i < NUM + 1;i++)
		{
			System.out.printf("%d",result[i]);
		}
		}
		return 0;
	}

}

