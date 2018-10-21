package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String str = new String(new char[10000]);
	  int i;
	  int k = 0;
	  int word = 1;
	  int[] a = new int[300];
	  str = new Scanner(System.in).nextLine();
	  for (i = 0;i < 300;i++)
	  {
		a[i] = 0;
	  }
	  for (i = 0;str.charAt(i) != '\0';i++)
	  {
		  if (str.charAt(i) != ' ')
		  {
			  a[k]++;
			  word = 1;
		  }
		  else if ((str.charAt(i) == ' ') && (word == 1))
		  {
			  k++;
			  word = 0;
		  }
	  }
	  System.out.printf("%d",a[0]);
	  for (i = 1;i < k + 1;i++)
	  {
		System.out.printf(",%d",a[i]);
	  }
	}
}
