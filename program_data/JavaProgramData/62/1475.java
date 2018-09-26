package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String p;
	  String[] q = new String[100];
	  int i;
	  int j;
	  int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p = malloc(100 * (Character.SIZE / Byte.SIZE));
	  p = new Scanner(System.in).nextLine();
	  for (i = 1,q[0] = p;i < 100;i++)
	  {
		q[i] = q[i - 1] + 1;
		if (q[i] == ' ')
		{
		for (j = 1; * (q[i] + j) == ' ';j++)
		{
			1;
		}
		q[i] = q[i] + j - 1;
		}
		if (*(q[i] + 1) == '\0')
		{
			n = i;
			break;
		}
	  }
	  for (i = 0;i <= n;i++)
	  {
		  System.out.printf("%c",q[i]);
	  }
	}
}
