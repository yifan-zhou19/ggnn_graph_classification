package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int La;
		int Lb;
		String A = new String(new char[100]);
		String B = new String(new char[100]);
		char[][] C = new char[30][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			A = new Scanner(System.in).nextLine();
			B = new Scanner(System.in).nextLine();
			System.in.read();
			La = A.length();
			Lb = B.length();
			for (j = Lb - 1;j >= 0;j--)
			{
				A = tangible.StringFunctions.changeCharacter(A, La - Lb + j, A.charAt(La - Lb + j) - B.charAt(j));
				if (A.charAt(La - Lb + j) < 0)
				{
					A.charAt(La - Lb + j) += 10;
					A.charAt(La - Lb + j - 1) -= 1;
				}
				A.charAt(La - Lb + j) += 48;
			}
			C[i] = A;
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.println(C[i]);
		}
	}

}

