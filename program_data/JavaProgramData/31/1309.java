public class stu
{
   public String xinxi = new String(new char[100]);
   public stu down;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 0;

	public static stu creat()
	{
		stu top = null;
		stu p1 = null;
		stu p2 = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(LEN);
	   p1.xinxi = new Scanner(System.in).nextLine();
		while (p1.xinxi.charAt(0) != 'e')
		{
	  n++;
	  if (n == 1)
	  {
	   p1.down = null;
	  }
	  else
	  {
	   p1.down = p2;
	  }
	  top = p1;
	  p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = (stu)malloc(LEN);
	  p1.xinxi = new Scanner(System.in).nextLine();
		}
	 return (top);
	}
	public static void Main()
	{
	 stu top;
	 stu p;
	 top = creat();
	 p = top;
		while (n != 0)
		{
		 n--;
	 System.out.println(p.xinxi);
	 p = p.down;
		}
	}

}
