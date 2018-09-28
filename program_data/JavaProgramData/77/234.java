package <missing>;

public class GlobalMembers
{
	public static int hands(int n)
	{
			int i;
			int j;
			int temp = 0;
			for (i = 0;i < n;i++)
			{
					if (c[i] == 0 && c[i + 1] == 1) //???????????????
					{
						System.out.print(b[i]);
						System.out.print(" ");
						System.out.print(b[i + 1]);
						System.out.print("\n");
						break;
					} //????????????
			}
			for (j = i + 2;j < n;j++)
			{
						c[j - 2] = c[j];
						b[j - 2] = b[j];
			} //???c???b?????????????
			if (n > 2)
			{
				return hands(n - 2); //?n>2????
			}
			else
			{

			return 0;
			}
	} //hands??
	public static int[] c = new int[200];
	public static int[] b = new int[100];
	public static int Main()
	{
			String a = new String(new char[100]);
			int i = 0;
			int num = 0;
			int j = 1;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			c[0] = 0;
			for (i = 1;i < a.length();i++) //????c???????????1???????0
			{
			if (a.charAt(i) == a.charAt(0))
			{
				c[j] = 0;
				j++;
				num++;
			}
			else
			{
				c[j] = 1;
				j++;
				num++;
			}
			}
			for (i = 0;i < a.length();i++)
			{
				b[i] = i; //??b???????????????
			}
			hands(num + 1); //????
			return 0;

	}

}

