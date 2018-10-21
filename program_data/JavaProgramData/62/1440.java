package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String a;
	  String b;
	  int i = 0;
	  int k = -1;
	  int q = 0;
	  int n;
	  int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  a = (String)malloc(100000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  b = (String)malloc(100000 * (Character.SIZE / Byte.SIZE));
	  String tempVar = ConsoleInput.scanfRead(null, 1);
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  while (*(a.Substring(i)) != '\n')
	  {
		  i++;
		  String tempVar2 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar2 != null)
		  {
			  a.Substring(i) = Integer.parseInt(tempVar2);
		  }
	  }
	  n = i;
	  for (i = 0;i < n;i++)
	  {
		  if (*(a.Substring(i)) != 32)
		  {
			  q = 1;
			  k++;
			  m++;
		  }
		else
		{
		if (q == 1)
		{
			k++;
			m++;
		}
		 q = 0;
		}
		*(b.Substring(k)) = *(a.Substring(i));
	  }
	  for (i = 0;i < m;i++)
	  {
		  System.out.printf("%c",*(b.Substring(i)));
	  }
	}
}

