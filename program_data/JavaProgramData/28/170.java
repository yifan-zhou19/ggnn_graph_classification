package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String str = new String(new char[1000]);
	  int num = 0;
	  int n = 0;
	  int i;
	  int j;
	  int word = 0;
	  int[] a = new int[300];
	  for (i = 0;;i++)
	  {
		  String tempVar = ConsoleInput.scanfRead(null, 1);
		  if (tempVar != null)
		  {
			  str = tangible.StringFunctions.changeCharacter(str, i, tempVar);
		  }
		if (str.charAt(i) == '\n')
		{
			break;
		}
		else
		{
			n++;
		}
	  }
	  for (i = 0;i < 300;i++)
	  {
		  a[i] = 0;
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (str.charAt(i) == ' ')
		  {
			  word = 0;
			  continue;
		  }
		  else if (word == 0)
		  {
			  word = 1;
			  num++;

		  }
		  a[num - 1]++;
	  }
		  for (i = 0;i < num - 1;i++)
		  {
			  System.out.printf("%d,",a[i]);
		  }
		  System.out.printf("%d",a[i]);
	}

}

