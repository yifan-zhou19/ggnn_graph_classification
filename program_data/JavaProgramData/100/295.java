package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int t;
		int num;
		int k;
		int xiaoxie;
		int zero;
		int[] NUM = new int[300];
		char c;
		String Original = new String(new char[300]);
		String A = new String(new char[300]);
		String B = new String(new char[300]);
		String C = new String(new char[300]);
		c = 'a';
		for (i = 0;c != '\n';i++)
		{
			c = System.in.read();
			Original = tangible.StringFunctions.changeCharacter(Original, i, c);
			A = tangible.StringFunctions.changeCharacter(A, i, c);
		}
		n = i;
		xiaoxie = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if ((Original.charAt(i) >= 97) && (Original.charAt(i) <= 122))
			{
				xiaoxie = 1;
			}
		}
		for (i = 0,k = 0;i <= n - 1;i++)
		{
			if ((A.charAt(i) >= 97) && (A.charAt(i) <= 122))
			{
				B = tangible.StringFunctions.changeCharacter(B, k, A.charAt(i));
				k = k + 1;
			}
		}
		n = k;
		k = 0;
		for (i = 0;i < 300;i++)
		{
			NUM[i] = 1;
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (B.charAt(i) != 0)
			{
				for (j = i + 1;j <= n - 1;j++)
				{
					if (B.charAt(i) == B.charAt(j))
					{
						B = B.substring(0, j);
						NUM[k] = NUM[k] + 1;
					}
				}
				k = k + 1;
			}
		}
			for (j = 0;j <= n - 1;j++)
			{

			for (i = 0;i < n - 1 - j;i++)
			{
				if (B.charAt(i) == 0)
				{
					zero = B.charAt(i);
					B = tangible.StringFunctions.changeCharacter(B, i, B.charAt(i + 1));
					B = tangible.StringFunctions.changeCharacter(B, i + 1, zero);
				}
			}
			}
			for (i = 0;i < k;i++)
			{
				C = tangible.StringFunctions.changeCharacter(C, i, B.charAt(i));
			}
			for (j = 0;j < k;j++)
			{
				for (i = 0;i < k - j;i++)
				{
					if (C.charAt(i) < C.charAt(i + 1))
					{
						c = C.charAt(i);
						C = tangible.StringFunctions.changeCharacter(C, i, C.charAt(i + 1));
						C = tangible.StringFunctions.changeCharacter(C, i + 1, c);
						t = NUM[i];
						NUM[i] = NUM[i + 1];
						NUM[i + 1] = t;
					}
				}
			}

			if (xiaoxie == 0)
			{
				System.out.print("No\n");
			}
			else
			{
				for (i = k - 1;i >= 0;i--)
				{
					System.out.printf("%c=%d\n",C.charAt(i),NUM[i]);
				}
			}
	}














}

