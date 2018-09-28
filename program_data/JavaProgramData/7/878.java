package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p1;
		String p2;
		String p3;
		String q1;
		String q2;
	 int i;
	 int j;
	 int k;
	 int flag;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = (String)malloc((Character.SIZE / Byte.SIZE) * 256);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p2 = (String)malloc((Character.SIZE / Byte.SIZE) * 256);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p3 = (String)malloc((Character.SIZE / Byte.SIZE) * 256);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 q1 = (String)malloc((Character.SIZE / Byte.SIZE) * 256);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 q2 = (String)malloc((Character.SIZE / Byte.SIZE) * 256);
	 p1 = new Scanner(System.in).nextLine();
	 p2 = new Scanner(System.in).nextLine();
	 p3 = new Scanner(System.in).nextLine();
	 for (i = 0;i < p1.length();i++)
	 {
		 flag = 1;
	  for (j = 0;j < p2.length();j++)
	  {
	  if (*(p1.Substring(i) + j) != *(p2.Substring(j)))
	  {
		flag = 0;
		break;
	  }
	  }
	  if (flag != 0)
	  {
		  for (k = 0;k < i;k++)
		  {
	   *(q1.Substring(k)) = *(p1.Substring(k));
		  }
	   *(q1.Substring(k)) = '\0';
	   for (k = i + p2.length();k < p1.length();k++)
	   {
	   *(q2.Substring(k) - i - p2.length()) = *(p1.Substring(k));
	   }
	   *(q2.Substring(k) - i - p2.length()) = '\0';
	   break;
	  }
	 }
	 if (flag != 0)
	 {
	 q1 += p3;
	 q1 += q2;
	 System.out.println(q1);
	 }
	 else
	 {
	 System.out.println(p1);
	 }
	}
}
