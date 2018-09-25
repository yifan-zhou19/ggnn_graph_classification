package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void prt(char a[],int n);
		int n = 0;
	  final String a = "";
	  a = new Scanner(System.in).nextLine();
	  n = a.length();
	  prt(a, n);
	  System.in.read();
	  System.in.read();
	  return (0);
	}
	public static void prt(String a, int n)
	{
		int i = 0;
		int t = 0;
	  for (i = 0;i < n;i++)
	  {
		  switch (a[i])
		  {
		   case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
		case '0':
			System.out.printf("%c",a[i]);
			t = 0;
			break;
	  default:
		  if (i < n - 1)
		  {
			  if (t == 0)
			  {
				  t = 1;
				  System.out.print("\n");
			  }
		  }
		  break;
		  }

	  }

	}
}
