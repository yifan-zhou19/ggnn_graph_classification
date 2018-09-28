package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		String q;
	  int i;
	  int c = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  q = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
	  for (i = 0;;i++)
	  {
		  String tempVar = ConsoleInput.scanfRead(null, 1);
		  if (tempVar != null)
		  {
			  p.Substring(i) = Integer.parseInt(tempVar);
		  }
		  c++;
	   if (*(p.Substring(i)) == '\n')
	   {
		   break;
	   }
	  }
	  for (i = 0;i < c - 2;i++)
	  {
		  *(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
	  }
	  *(q.Substring(i)) = *(p.Substring(i)) + p;
	  for (i = 0;i < c - 1;i++)
	  {
	  System.out.printf("%c",*(q.Substring(i)));
	  }
	}








}

