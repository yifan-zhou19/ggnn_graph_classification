package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static PutMethod(int apple,int plate)
	{
		int k;
		int k1 = 0;
		int k2 = 0;
	 if (plate == 1)
	 {
		 k = 1;
	 }
	 else
	 {
			if (apple < plate)
			{
				k2 = 0;
			}
		 if (apple == plate)
		 {
			 k2 = 1;
		 }
		 if (apple > plate)
		 {
			k2 = PutMethod(apple - plate,plate);
		 }
			k1 = PutMethod(apple,plate-1);
		 k = k2 + k1;
	 }

	 return k;
	}
	public static int Main()
	{
		int t;
		int apple;
		int plate;
		int i;
		int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < t;i++)
	 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				apple = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				plate = Integer.parseInt(tempVar3);
			}
		 k = PutMethod(apple,plate);
		 System.out.printf("%d\n",k);
	 }
	}
}

