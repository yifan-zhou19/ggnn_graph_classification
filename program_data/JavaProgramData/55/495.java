package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x = 0;
		int y = 0;
		int k = 0;
		int t = 0;
		int i;
		int m = 0;
		int j;
		final String a = "";
		final String b = "";
		int[] A = new int[100];
		int[] B = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		k = a.length();


		for (i = 0;i < k;i++)
		{
			if (a.charAt(i) > 96)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (a.charAt(i) > 64 && a.charAt(i) < 91)
			{
				A[i] = a.charAt(i) - 55;
			}
			if (a.charAt(i) > 47 && a.charAt(i) < 59)
			{
				A[i] = a.charAt(i) - 48;
			}
			t = t * x + A[i];
		}
		//printf("@@%d&&  ",t);??debug~
		if (t == 0)
		{
			System.out.print("0"); //??????????????????????empty output??
		}

		for (j = 0;;j++)
		{
			if (t / (int)(Math.pow(y,j)) == 0)
			{
				break;
			}
		}


		//printf("!!%d!!  ",j);
		for (i = j - 1;i >= 0;i--) //????~
		{
			B[i] = t % y;
			t = (t - B[i]) / y;
			if (B[i] < 10)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, B[i] + 48);
			}
			if (B[i] > 9)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, B[i] + 55);
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}

	}
}

