package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] Number = new int[2000];
		String C = new String(new char[2000]);
		int Top = 0;
		C = new Scanner(System.in).nextLine();
		N = C.length();
		for (int I = 0; I < N; I++)
		{
			if (C.charAt(I) != C.charAt(0))
			{
				System.out.print(Number[Top]);
				System.out.print(" ");
				System.out.print(I);
				System.out.print("\n");
				Top--;
			}
				else
				{
					Number[++Top] = I;
				}
		}
	}
}
