package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a;
		String p;
	  int i;
	  int t;
	  int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  a = (int)malloc(30 * (Character.SIZE / Byte.SIZE));
	  a = new Scanner(System.in).nextLine();
	  n = a.length();
	  p = a;
	  t = 0;
	  for (i = 0;i <= (n - 1);i++)
	  {
			if (*(p.Substring(i)) >= 48 && *(p.Substring(i)) <= 57)
			{
				System.out.printf("%c",*(p.Substring(i)));
				t = 0;
			}
			else if (t == 0)
			{
				System.out.print("\n");
				t = 1;
			}
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(a);
	}
}
