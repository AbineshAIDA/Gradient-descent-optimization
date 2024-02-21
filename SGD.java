public class SGDExample {

    public static void main(String[] args) {
        float[] x1 = {0, 2, 1, -2};
        float[] x2 = {1, 1, 0, 1};
        float[] y = {1, 9, 1, 7};
        
        float learningRate = 0.01f;
        float w1 = 0; 
        float w2 = 0; 

        int epochs = 1000; 

        for (int epoch = 0; epoch < epochs; epoch++) {
            for (int i = 0; i < x1.length; i++) {
                float gradientW1 = gradW1(x1[i], x2[i], y[i], w1, w2);
                float gradientW2 = gradW2(x1[i], x2[i], y[i], w1, w2);

               
                w1 -= learningRate * gradientW1;
                w2 -= learningRate * gradientW2;
            }
        }

        System.out.println("Final w1: " + w1);
        System.out.println("Final w2: " + w2);
    }

    // Gradient for w1
    static float gradW1(float x1, float x2, float y, float w1, float w2) {
        return (2 * (w1 * x1 + w2 * x2 - y) * x1);
    }

    // Gradient for w2
    static float gradW2(float x1, float x2, float y, float w1, float w2) {
        return (2 * (w1 * x1 + w2 * x2 - y) * x2);
    }
}
