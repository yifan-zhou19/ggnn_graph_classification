public class reward
{
   public String name = new String(new char[20]);
   public int fgra;
   public int tgra;
   public char gb;
   public char xb;
   public int lw;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pr;
		int pr;
		int sum = 0;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		reward * p = new reward();
		reward temp = new reward();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		reward rew = (reward)malloc(sizeof(reward) * n);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *trew=(int*)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int trew = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (p = rew;p < rew + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.fgra = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.tgra = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.lw = Integer.parseInt(tempVar7);
			}
		}
		for (p = rew,pr = trew;p < rew + n;p++,pr++)
		{
			pr = null;
			if (p.fgra > 80 && p.lw >= 1)
			{
				pr += 8000;
				sum += 8000;
			}
			if (p.fgra > 85 && p.tgra > 80)
			{
				pr += 4000;
				sum += 4000;
			}
			if (p.fgra > 90)
			{
				pr += 2000;
				sum += 2000;
			}
			if (p.fgra > 85 && p.xb == 'Y')
			{
				pr += 1000;
				sum += 1000;
			}
			if (p.tgra > 80 && p.gb == 'Y')
			{
				pr += 850;
				sum += 850;
			}
		}

		max = trew;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=*rew;
		temp.copyFrom(rew);
		for (p = rew,pr = trew;p < rew + n;p++,pr++)
		{
			if (pr > max)
			{
				max = pr;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=*p;
				temp.copyFrom(p);
			}
		}
		System.out.printf("%s\n%d\n%d\n",temp.name,max,sum);
		return 0;
	}


}

