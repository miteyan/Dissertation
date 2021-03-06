package uk.ac.cam.mp781.feature_extraction;

/**
 * Created by miteyan on 24/01/2018.
 */
public class Features {

    private int nodes, edges, maxDegree;
    private double density;
    private int diameter, radius, centreSize;
    private double meanEccentricity, varEccentricity, meanClusteringCoefficient, varClusteringCoefficient, meanNodeBetweennessCentrality, varNodeBetweennessCentrality, meanShortestPathLength, varShortestPathLength, meanEdgeBetweenessCentrality, varEdgeBetweenessCentrality, meanPagerank, varPagerank;

    @Override
    public String toString() {
        return "Features{" +
                "nodes=" + nodes +
                ", edges=" + edges +
                ", maxDegree=" + maxDegree +
                ", density=" + density +
                ", diameter=" + diameter +
                ", radius=" + radius +
                ", centreSize=" + centreSize +
                ", meanEccentricity=" + meanEccentricity +
                ", varEccentricity=" + varEccentricity +
                ", meanClusteringCoefficient=" + meanClusteringCoefficient +
                ", varClusteringCoefficient=" + varClusteringCoefficient +
                ", meanBetweennessCentrality=" + meanNodeBetweennessCentrality +
                ", varBetweennessCentrality=" + varNodeBetweennessCentrality +
                ", meanShortestPathLength=" + meanShortestPathLength +
                ", varShortestPathLength=" + varShortestPathLength +
                ", meanEdgeBetweenessCentrality=" + meanEdgeBetweenessCentrality +
                ", varEdgeBetweenessCentrality=" + varEdgeBetweenessCentrality +
                ", meanPagerank=" + meanPagerank +
                ", varPagerank=" + varPagerank +
                '}';
    }

    public void setNodes(int nodes) {
        this.nodes = nodes;
    }

    public void setEdges(int edges) {
        this.edges = edges;
    }

    public void setMaxDegree(int maxDegree) {
        this.maxDegree = maxDegree;
    }

    public void setDensity() {
        density = edges/(nodes*(nodes-1.0));
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCentreSize(int centreSize) {
        this.centreSize = centreSize;
    }

    public void setMeanEccentricity(double meanEccentricity) {
        this.meanEccentricity = meanEccentricity;
    }

    public void setVarEccentricity(double varEccentricity) {
        this.varEccentricity = varEccentricity;
    }

    public void setMeanClusteringCoefficient(double meanClusteringCoefficient) {
        this.meanClusteringCoefficient = meanClusteringCoefficient;
    }

    public void setVarClusteringCoefficient(double varClusteringCoefficient) {
        this.varClusteringCoefficient = varClusteringCoefficient;
    }

    public void setMeanShortestPathLength(double meanShortestPathLength) {
        this.meanShortestPathLength = meanShortestPathLength;
    }

    public void setVarShortestPathLength(double varShortestPathLength) {
        this.varShortestPathLength = varShortestPathLength;
    }

    public void setMeanEdgeBetweenessCentrality(double meanEdgeBetweenessCentrality) {
        this.meanEdgeBetweenessCentrality = meanEdgeBetweenessCentrality;
    }

    public void setVarEdgeBetweenessCentrality(double varEdgeBetweenessCentrality) {
        this.varEdgeBetweenessCentrality = varEdgeBetweenessCentrality;
    }

    public void setMeanPagerank(double meanPagerank) {
        this.meanPagerank = meanPagerank;
    }

    public void setMeanNodeBetweennessCentrality(double meanNodeBetweennessCentrality) {
        this.meanNodeBetweennessCentrality = meanNodeBetweennessCentrality;
    }

    public void setVarNodeBetweennessCentrality(double varNodeBetweennessCentrality) {
        this.varNodeBetweennessCentrality = varNodeBetweennessCentrality;
    }

    public void setVarPagerank(double varPagerank) {
        this.varPagerank = varPagerank;
    }

    public Features() {
    }

    public int getNodes() {
        return nodes;
    }

    public int getEdges() {
        return edges;
    }

    public int getMaxDegree() {
        return maxDegree;
    }

    public double getDensity() {
        return density;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getRadius() {
        return radius;
    }

    public int getCentreSize() {
        return centreSize;
    }

    public double getMeanEccentricity() {
        return meanEccentricity;
    }

    public double getVarEccentricity() {
        return varEccentricity;
    }

    public double getMeanClusteringCoefficient() {
        return meanClusteringCoefficient;
    }

    public double getVarClusteringCoefficient() {
        return varClusteringCoefficient;
    }

    public double getMeanNodeBetweennessCentrality() {
        return meanNodeBetweennessCentrality;
    }

    public double getVarNodeBetweennessCentrality() {
        return varNodeBetweennessCentrality;
    }

    public double getMeanShortestPathLength() {
        return meanShortestPathLength;
    }

    public double getVarShortestPathLength() {
        return varShortestPathLength;
    }

    public double getMeanEdgeBetweenessCentrality() {
        return meanEdgeBetweenessCentrality;
    }

    public double getVarEdgeBetweenessCentrality() {
        return varEdgeBetweenessCentrality;
    }

    public double getMeanPagerank() {
        return meanPagerank;
    }

    public double getVarPagerank() {
        return varPagerank;
    }
}

