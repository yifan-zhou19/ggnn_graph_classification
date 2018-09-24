package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		char[] A = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char temp = 0;
		int test = 1;
		for (i = 0;i < 300;i++)
		{
			temp = System.in.read();
			if ('\n' == temp)
			{
				break;
			}
			 if (temp >= 'A' && temp <= 'Z')
			 {
			temp = temp - 'A';
			if (0 <= temp && temp < 26)
			{
				A[(int)temp]++;
			}
			 }
		  if (temp >= 'a' && temp <= 'z')
		  {
			temp = temp - 'a';
			if (0 <= temp && temp < 26)
			{
				a[(int)temp]++;
			}
		  }
		}
		 for (i = 0;i < 26;i++)
		 {

			if (A[i] != null)
			{
				System.out.printf("%c=%d\n",('A' + i),A[i]);
				test = 0;
			}
		 }
		for (i = 0;i < 26;i++)
		{
			if (a[i] != null)
			{
				System.out.printf("%c=%d\n",('a' + i),a[i]);
				test = 0;
			}
		}
		if (test != 0)
		{
		System.out.print("No\n");
		}
		return 0;
	}
}
