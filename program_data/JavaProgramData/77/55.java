package <missing>;

public class GlobalMembers
{
	public static void cool(int n, String A, char a)
	{
		int i;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			if (!A[i].equals(-1))
			{
			for (j = i + 1;j < n;j++)
			{
				if (A[j].equals(-1))
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loap1;
				}
				if (A[i].equals(A[j]))
				{
					break;
				}
				if (!A[i].equals(A[j]) && A[i].equals(a))
				{
					System.out.printf("%d %d\n",i,j);
					A[i] = -1;
					A[j] = -1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loap2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loap1:
	;
				}
			}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loap2:
	;
		for (i = 0;i < n;i++)
		{
			if (!A[i].equals(-1))
			{
				cool(n, A, a);
				break;
			}
		}
		return;
	}
	public static int Main()
	{
		String A = new String(new char[100]);
		char a;
		int n;
		A = new Scanner(System.in).nextLine();
		n = A.length();
		a = A.charAt(0);
		cool(n, A, a);
		return 0;
	}

}
