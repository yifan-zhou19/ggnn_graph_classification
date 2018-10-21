//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int[] shuru = new int[1000000];
	public static int[] xiaoshuchangdu = new int[10];
	public static int[] changdu = new int[10];
	public static int[] zhengshuchangdu = new int[10];
	public static int fuzhu; //????????????
	public static int wuaoshu;
	public static int[][] a = new int[10][1000000];
	public static int n = 0;

	public static void clear(int k)
	{
		 for (int i = 0;i <= 999999;i++)
		 {
		 a[k][i] = 0;
		 }
		 xiaoshuchangdu[k] = 0;
		 changdu[k] = 1;
		 zhengshuchangdu[k] = 1;
	}

	public static void xieru(int k)
	{
		fuzhu = 0;
		for (int i = 1;;i++)
		{
			shuru[i] = System.in.read();
			if (shuru [i] == 10)
			{
			   changdu[k] = i - 1;
			   break;
			}
			if (shuru [i] == 46)
			{
			   fuzhu = 1;
			   xiaoshuchangdu[k]--;
			   i--;
			}
			a[k][i] = shuru[i] - 48;
			if (fuzhu == 1)
			{
			xiaoshuchangdu[k]++;
			}
		}
		zhengshuchangdu[k] = changdu[k] - xiaoshuchangdu[k];
	}


	public static void shuchu(int m)
	{
		 for (int i = 1;i <= zhengshuchangdu[m];i++)
		 {
		 System.out.print(a[m][i]);
		 }
		 if (xiaoshuchangdu[m] > 0)
		 {
			System.out.print(".");
			for (int i = zhengshuchangdu[m] + 1;i <= changdu[m];i++)
			{
			System.out.print(a[m][i]);
			}
		 }
	}



	public static void jiafa(int k,int l,int m)
	{
		 clear(m);
		 int fzheng = Math.max(zhengshuchangdu[k],zhengshuchangdu[l]) + 1;
		 int fxiao = Math.max(xiaoshuchangdu[k],xiaoshuchangdu[l]);
		 for (int i = fxiao + fzheng;i >= 1;i--)
		 {
			 a[m][i] = a[m][i] + (a[k][zhengshuchangdu[k] + i - fzheng] + a[l][zhengshuchangdu[l] + i - fzheng]);
			 a[m][i - 1] = a[m][i - 1] + a[m][i] / 10;
			 a[m][i] = a[m][i] % 10;
		 }
		 while (true)
		 {
			 if (a[m][1] != 0)
			 {
			 break;
			 }
			 if (fzheng + fxiao == 1)
			 {
			 break;
			 }
			 for (int i = 0;i <= fxiao + fzheng;i++)
			 {
			 a[m][i] = a[m][i + 1];
			 }
			 fzheng = fzheng - 1;
		 }
		 for (int i = fzheng + fxiao;i >= 1;i--)
		 {
			 if (a[m][i] != 0)
			 {
			 break;
			 }
			 fxiao = fxiao - 1;
		 }
		 zhengshuchangdu[m] = fzheng;
		 xiaoshuchangdu[m] = fxiao;
		 changdu[m] = fxiao + fzheng;
	}

	public static void jiandancheng(int n,int k,int m)
	{
		 clear(m);
		 int fzheng = zhengshuchangdu[k] + 1;
		 int fxiao = xiaoshuchangdu[k];
		 for (int i = fxiao + fzheng;i >= 1;i--)
		 {
			 a[m][i] = a[m][i] + a[k][zhengshuchangdu[k] + i - fzheng] * n;
			 a[m][i - 1] = a[m][i - 1] + a[m][i] / 10;
			 a[m][i] = a[m][i] % 10;
		 }
		 while (true)
		 {
			 if (a[m][1] != 0)
			 {
			 break;
			 }
			 if (fzheng + fxiao == 1)
			 {
			 break;
			 }
			 for (int i = 0;i <= fxiao + fzheng;i++)
			 {
			 a[m][i] = a[m][i + 1];
			 }
			 fzheng = fzheng - 1;
		 }
		 for (int i = fzheng + fxiao;i >= 1;i--)
		 {
			 if (a[m][i] != 0)
			 {
			 break;
			 }
			 fxiao = fxiao - 1;
		 }
		 zhengshuchangdu[m] = fzheng;
		 xiaoshuchangdu[m] = fxiao;
		 changdu[m] = fxiao + fzheng;
	}

	public static void chengfa(int k,int l,int m) //????? 8.9?????
	{
		 int fxiao;
		 int fzheng;
		 clear(m);
		 for (int i = 1;i <= changdu[l];i++)
		 {
			 jiandancheng(a[l][i], k, 9);
			 jiafa(m, 9, 8);
			 if (i == changdu[l])
			 {
				jiandancheng(1, 8, m);
				break;
			 }
			 jiandancheng(10, 8, m);
		 }
		 fxiao = xiaoshuchangdu[k] + xiaoshuchangdu[l];
		 fzheng = changdu[m] - fxiao;
		 while (true)
		 {
			 if (a[m][1] != 0)
			 {
			 break;
			 }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
