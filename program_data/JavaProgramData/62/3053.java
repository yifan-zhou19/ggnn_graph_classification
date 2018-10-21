package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int k;
	char[][] jz = new char[2][1001];
	 k = 0;
	 jz[0] = new Scanner(System.in).nextLine();
	 for (i = 0;i < String.valueOf(jz[0]).length();i++)
	 {
	  if (jz[0][i] != ' ' || jz[0][i] == ' ' && jz[0][i - 1] != ' ')
	  {
	   jz[1][k] = jz[0][i];
	   k++;
	  }
	 }
	jz[1][k] = '\0';
	System.out.printf("%s",jz[1]);
	return 0;
	}

}
