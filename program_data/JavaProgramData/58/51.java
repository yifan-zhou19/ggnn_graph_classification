package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 String b = new String(new char[10]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 b = new Scanner(System.in).nextLine();
	 String[] p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (String)malloc(n * (Character.SIZE / Byte.SIZE));
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p[i] = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
	  p[i] = new Scanner(System.in).nextLine();
	  j = 1;
	  if (p[i] == '_' || (p[i] >= 'a' && p[i] <= 'z') || (p[i] >= 'A' && p[i] <= 'Z'))
	  {
	   while (*(p[i] + j) != '\0')
	   {
		if (*(p[i] + j) == '_' || (*(p[i] + j) >= '0' && *(p[i] + j) <= '9') || (*(p[i] + j) >= 'a' && *(p[i] + j) <= 'z') || (*(p[i] + j) >= 'A' && *(p[i] + j) <= 'Z'))
		{
			j++;
		}
		else
		{
			break;
		}
	   }
		if (*(p[i] + j) == '\0')
		{
			System.out.print("1\n");
		}
		else
		{
			System.out.print("0\n");
		}
	  }
	  else
	  {
		  System.out.print("0\n");
	  }
	 }
	}
}

