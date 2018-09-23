package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int ID,chin,math;
	//	};
		stu pp;
		int sum;
		int second;
		int third;
		int x;
		int y;
		int z;
		int i;
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pp = (stu)malloc(sizeof(stu) * n);
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			  (pp + i).ID = a;
			  (pp + i).chin = b;
			  (pp + i).math = c;
		}
		sum = ((pp + i).chin) + ((pp + i).math);
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				sum = ((pp + i).chin) + ((pp + i).math);
				second = ((pp + i).chin) + ((pp + i).math);
				third = ((pp + i).chin) + ((pp + i).math);
				x = (pp + i).ID;
				y = (pp + i).ID;
				z = (pp + i).ID;

			}
			else if (i == 2)
			{
				if (sum < ((pp + i).chin) + ((pp + i).math))
				{
					second = sum;
					sum = ((pp + i).chin) + ((pp + i).math);
					y = x;
					x = (pp + i).ID;
				}
							   else
							   {
									   third = ((pp + i).chin) + ((pp + i).math);
									   z = (pp + i).ID;
							   }
			}
			else
			{
				if (sum < ((pp + i).chin) + ((pp + i).math))
				{
										third = second;
					second = sum;
					sum = ((pp + i).chin) + ((pp + i).math);
										 z = y;
					y = x;
					x = (pp + i).ID;
				}
				else if (second < ((pp + i).chin) + ((pp + i).math))
				{
					third = second;
					second = ((pp + i).chin) + ((pp + i).math);
					z = y;
					y = (pp + i).ID;
				}
							   else if (third < ((pp + i).chin) + ((pp + i).math))
							   {
										third = ((pp + i).chin) + ((pp + i).math);
										z = (pp + i).ID;
							   }
			}
		}
			System.out.printf("%d %d\n",x,sum);
			System.out.printf("%d %d\n",y,second);
			System.out.printf("%d %d\n",z,third);
				return 0;
	}
}

