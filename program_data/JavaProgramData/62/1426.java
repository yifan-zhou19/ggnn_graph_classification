package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String s;
	   int i;
	   int j = 0;
	   int m;
	   int n;
	   int k = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   s = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));

	   for (i = 0;i < 1000;i++)
	   {
		   String tempVar = ConsoleInput.scanfRead(null, 1);
		   if (tempVar != null)
		   {
			   s.Substring(i) = Integer.parseInt(tempVar);
		   }
	   }
	   for (i = 0; * (s.Substring(i)) != '\0';i++)
	   {
		   if (*(s.Substring(i)) == ' ')
		   {
			   for (j = i + 1; * (s.Substring(j)) == ' ';j++)
			   {
				   for (k = j; * (s.Substring(k)) != '\0';k++)
				   {
				   *(s.Substring(k) - 1) = *(s.Substring(k));
				   }
				   j--;
			   }

		   }
	   }
		   for (i = 0; * (s.Substring(i)) != '\0';i++)
		   {
		   System.out.printf("%c",*(s.Substring(i)));
		   }

	}


}

