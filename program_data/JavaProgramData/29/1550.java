package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int m; //???m,n
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++) //????m?n
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			float a = 1F; //??????
			float b = 2F;
			float s = 0F;
			float t;
			for (int j = 1;j <= n;j++) //??
			{
				s = s + b / a;
				t = b;
				b = a + b;
				a = t;
			}
			System.out.printf("%.3f",s); //????
			System.out.print("\n");
		}
		return 0; //?????
	}
}

