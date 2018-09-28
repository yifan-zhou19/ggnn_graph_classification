package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[100]);
		 int[] a = new int[100];
		 int i;
		 int j;
		 int len;
		 int c;
		 int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		b = 0;
		len = s.length();
	   for (i = 0;i < len;i++)
	   {
			if (s.charAt(i) == '0')
			{
			  c = 0;
			}
			else if (s.charAt(i) == '1')
			{
			  c = 1;
			}
			else if (s.charAt(i) == '2')
			{
			  c = 2;
			}
			else if (s.charAt(i) == '3')
			{
			  c = 3;
			}
			else if (s.charAt(i) == '4')
			{
			  c = 4;
			}
		else if (s.charAt(i) == '5')
		{
			  c = 5;
		}
		else if (s.charAt(i) == '6')
		{
			  c = 6;
		}
		else if (s.charAt(i) == '7')
		{
			  c = 7;
		}
		else if (s.charAt(i) == '8')
		{
			  c = 8;
		}
		else if (s.charAt(i) == '9')
		{
				  c = 9;
		}
		b = b * 10 + c;
		a[i] = b / 13;
		b = b - a[i] * 13;
	   }
		  i = 0;
			 do
			 {
				  i = i + 1;
			 } while (a[i] == 0);
			 for (j = i;j < len - 1;j++)
			 {
			   System.out.printf("%d",a[j]);
			 }
			   System.out.printf("%d\n",a[len - 1]);
			   System.out.printf("%d\n",b);
			   System.in.read();
			   System.in.read();
	}
}

